package Problems;

import java.util.*;

class CNF{
    Map<Character, Set<String>> cfg;
    Set<Character> terminals, variables, nullables, nonGenerating,reachable, nonReachable, leftSymbols;
    int index;
    char[] availableSymbols;
    char startSymbol;
    public CNF(Map<Character, Set<String>> cfg) {
        this.cfg = cfg;
        terminals = new HashSet<>();
        variables = new HashSet<>();
        nullables = new HashSet<>();
        nonGenerating = new HashSet<>();
        reachable = new HashSet<>();
        nonReachable = new HashSet<>();
        leftSymbols = new HashSet<>();
        index = 0;
        startSymbol = 'S';
    }


    public void terminalsAndVariables(){

        for (Map.Entry<Character, Set<String>> entry: cfg.entrySet()){
            char lhs = entry.getKey();
            Set<String> rhs = entry.getValue();

            variables.add(lhs);
            leftSymbols.add(lhs);

            for(String rule: rhs){
                for(Character c: rule.toCharArray()){
                    if(Character.isUpperCase(c)) variables.add(c);
                    if(Character.isLowerCase(c)) terminals.add(c);
                }
            }
        }
    }

    public void startCheck(){
        boolean flag = false;
        for (Map.Entry<Character, Set<String>> entry: cfg.entrySet()){
            Set<String> rhs = entry.getValue();
            for (String rule: rhs){
                if(rule.contains(startSymbol+"")) flag = true;
            }
        }
        if(flag){
            startSymbol = 'T';
            Set<String> tempSet = new HashSet<>();
            tempSet.add("S");
            cfg.put(startSymbol, tempSet);
            System.out.println("New start symbol T added, grammar = " + cfg);
        }
    }
    public void findNullable(){

        for (Map.Entry<Character, Set<String>> entry: cfg.entrySet()){
            char lhs = entry.getKey();
            Set<String> rhs = entry.getValue();
            if(rhs.contains("$")) nullables.add(lhs);
        }

        boolean flag = true;
        while(flag) {
            outer: for (Map.Entry<Character, Set<String>> entry: cfg.entrySet()){
                char lhs = entry.getKey();
                String rhs = entry.getValue().toString();
                Set<Character> nullCopy = new HashSet<>(nullables);
                for(Character c: nullCopy){
                    if(rhs.contains(c + "")) {
                        nullables.add(lhs);
                        continue outer;
                    }
                }
            }
            flag = false;
        }
    }

    public void removeNullable(){

        boolean flag = true;
        while(flag) {
            outer: for (Map.Entry<Character, Set<String>> entry: cfg.entrySet()){
                char lhs = entry.getKey();
                Set<String> rhs = entry.getValue();
                for(String rule: rhs){
                    for(Character c: rule.toCharArray()){
                        if(nullables.contains(c)){
                            String newRule = rule.replace(c+"","");
                            if(newRule.length() > 0)  {
                                cfg.get(lhs).add(newRule);
                                continue outer;
                            }
                        }
                    }
                    flag = false;
                }
            }
        }
        for (Map.Entry<Character, Set<String>> entry: cfg.entrySet()){
            Set<String> rhs = entry.getValue();
            rhs.remove("$");
        }
    }

    public void removeUnitProductions(){
        boolean flag = true;
        while(flag) {
            flag = false;
            for (Map.Entry<Character, Set<String>> entry: cfg.entrySet()){
                char lhs = entry.getKey();
                Set<String> rhs = entry.getValue();
                Set<String> rhsCopy = new HashSet<>(rhs);

                for(String rule: rhsCopy){
                    if(rule.length() == 1 && Character.isUpperCase(rule.charAt(0))){
                        flag = true;
                        rhs.remove(rule);
                        cfg.get(lhs).addAll(cfg.get(rule.charAt(0)));
                    }
                }
            }

        }
    }

    public void removeNonGenerating(){
        Set<Character> generating = new HashSet<>(terminals);
        generating.add('S');

        for (Map.Entry<Character, Set<String>> entry: cfg.entrySet()){
            char lhs = entry.getKey();
            Set<String> rhs = entry.getValue();

            for (String rule: rhs){
                if(rule.length() == 1 && Character.isLowerCase(rule.charAt(0))) generating.add(lhs);
            }
        }

        int prevGeneratingSize = generating.size();
        while(true) {
            outer: for (Map.Entry<Character, Set<String>> entry: cfg.entrySet()){
                boolean addSymbol = true;
                char lhs = entry.getKey();
                Set<String> rhs = entry.getValue();
                nextRule: for (String rule: rhs){
                    for(Character c: rule.toCharArray()){
                        if(!generating.contains(c)) {
                            addSymbol = false;
                            continue nextRule;
                        }
                    }
                    if(addSymbol && !generating.contains(lhs)) {
                        generating.add(lhs);
                        break outer;
                    }
                }
            }
            int newGeneratingSize = generating.size();
            if (prevGeneratingSize == newGeneratingSize) break;

            prevGeneratingSize = newGeneratingSize;
        }


        nonGenerating.addAll(variables);
        nonGenerating.removeAll(generating);

        for (Character c: nonGenerating){
            cfg.remove(c);
        }

        for (Map.Entry<Character, Set<String>> entry: cfg.entrySet()){

            Set<String> rhs = entry.getValue();
            Set<String> rhsCopy = new HashSet<>(rhs);
            for (String rule: rhsCopy){

                for(Character c: rule.toCharArray()){
                    if(nonGenerating.contains(c)) rhs.remove(rule);
                }
            }
        }
    }

    public void findUnreachable(){

        ArrayDeque<Character> visited = new ArrayDeque<>();
        reachable.add(startSymbol);
        char currentSymbol = startSymbol;
        visited.push('$');
        Set<String> rhs;

        do {
            rhs = cfg.get(currentSymbol);
            for(String rule: rhs){
                for (Character c: rule.toCharArray()){
                    if(Character.isUpperCase(c)) {
                        if(!reachable.contains(c)) {
                            reachable.add(c);
                            visited.push(c);
                        }
                    }
                }
            }
            currentSymbol = visited.pop();
        }while (currentSymbol != '$');
    }

    public void removeUnreachable(){
        System.out.println("Reachable = "+reachable);
        nonReachable.addAll(variables);
        nonReachable.removeAll(reachable);
        for (Character c: nonReachable){
            cfg.remove(c);
        }
    }

    public void replaceNewSymbol(char newSymbol, String newString){
        for (Map.Entry<Character, Set<String>> entry: cfg.entrySet()){
            Set<String> rhs = entry.getValue();
            Set<String> newRhs = new HashSet<>();


            for (String rule: rhs){
                if(rule.length() > 2){
                    if(rule.contains(newString)){
                        rule = rule.replace(newString, newSymbol+"");
                    }
                }
                newRhs.add(rule);
            }
            cfg.put(entry.getKey(), newRhs);
        }

    }

    public void reduceLength(){
        Set<Character> temp = new HashSet<>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'));
        temp.removeAll(variables);

        availableSymbols = new char[temp.size()];
        int i = 0;
        for(Character c: temp){
            availableSymbols[i++] = c;
        }
        index = 0;
        int newIndex;
        Set<String> newAdded = new HashSet<>();
        while(true) {
            Map<Character, Set<String>> cfgCopy = new HashMap<>(cfg);
            newIndex = index;
            for (Map.Entry<Character, Set<String>> entry: cfgCopy.entrySet()){
                Set<String> rhs = entry.getValue();

                for (String rule: rhs){
                    Set<String> cutRules = new HashSet<>();
                    if(rule.length() > 2){
                        String tempStr = rule.substring(1);
                        if(newAdded.isEmpty() || !newAdded.contains(tempStr)){
                            newAdded.add(tempStr);
                            char newSymbol = availableSymbols[newIndex++];
                            cutRules.add(tempStr);
                            cfg.put(newSymbol, cutRules);
                            replaceNewSymbol(newSymbol, tempStr);
                        }
                    }
                }
            }
            if (index == newIndex) break;
            else index = newIndex;
        }
    }


    public void replaceConstricted(Character newSymbol, String newString){
        for (Map.Entry<Character, Set<String>> entry: cfg.entrySet()){
            Set<String> rhs = entry.getValue();
            Set<String> newRhs = new HashSet<>();


            for (String rule: rhs){

                if(rule.length() == 2 && !(rule.equals(rule.toUpperCase()))){
                    if(rule.contains(newString)){
                        rule = rule.replace(newString, newSymbol+"");
                    }
                }
                newRhs.add(rule);
            }
                cfg.put(entry.getKey(), newRhs);
        }
    }
    public void finalCNF(){
        int newIndex;
        Set<String> newAdded = new HashSet<>();
        while(true) {
            Map<Character, Set<String>> cfgCopy = new HashMap<>(cfg);
            newIndex = index;
            for (Map.Entry<Character, Set<String>> entry: cfgCopy.entrySet()){
                Set<String> rhs = entry.getValue();
                for(String rule: rhs){
                    if(rule.length() == 2){
                        if(rule.equals(rule.toUpperCase()) || rule.equals(rule.toLowerCase())) continue;
                        else{
                            String tempStr;
                            if(Character.isUpperCase(rule.charAt(0))){
                                 tempStr = rule.charAt(1) + "";

                            } else {
                                 tempStr = rule.charAt(0) + "";

                            }
                            if(newAdded.isEmpty() || !newAdded.contains(tempStr)){
                                newAdded.add(tempStr);
                                char newSymbol = availableSymbols[newIndex++];
                                Set<String> tempSet = new HashSet<>();
                                tempSet.add(tempStr);
                                cfg.put(newSymbol, tempSet);
                                replaceConstricted(newSymbol, tempStr);
                            }
                        }
                    }
                }
            }
            if (index == newIndex) break;
            else index = newIndex;
        }
    }
    public void convert(){
        terminalsAndVariables();
        startCheck();
        findNullable();
        removeNullable();
        removeUnitProductions();
        removeNonGenerating();
        findUnreachable();
        removeUnreachable();
        reduceLength();
        finalCNF();
    }

    public void printDetails(){
        System.out.println("Nullable variables = "+nullables);
        System.out.println("Non-generating variables = " + nonGenerating);
        System.out.println("non reachable variables = "+nonReachable);
        System.out.println("CNF form = " + cfg);
    }
}

class CYK {
    public static boolean cykAlgorithm(Map<Character, Set<String>> grammar, String string) {
        int n = string.length();
        Set<Character>[][] table = new Set[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                table[i][j] = new HashSet<>();
            }
        }
        for (int i = 0; i < n; i++) {
            for (Character rule : grammar.keySet()) {
                if (grammar.get(rule).contains(String.valueOf(string.charAt(i)))) {
                    table[i][0].add(rule);
                }
            }
        }
        for (int j = 1; j < n; j++) {
            for (int i = 0; i < n - j; i++) {
                for (int k = 0; k < j; k++) {
                    for (Character sym : grammar.keySet()) {
                        for (String rhs : grammar.get(sym)) {
                            if (rhs.length() == 2 && table[i][k].contains(rhs.charAt(0))
                                    && table[i + k + 1][j - k - 1].contains(rhs.charAt(1))) {
                                table[i][j].add(sym);
                            }
                        }
                    }
                }
            }
        }
        return table[0][n - 1].contains('S');
    }
}

public class S20210010027_code{
    public static void main(String[] args) {
        Map<Character, Set<String>> cfg = new HashMap<>();
        Set<String> rule = new HashSet<>();

        rule.add("ASB");
        rule.add("ab");
        cfg.put('S', rule);

        rule = new HashSet<>();

        rule.add("aAS");
        rule.add("a");
        rule.add("$");

        cfg.put('A', rule);

        rule = new HashSet<>();

        rule.add("SbS");
        rule.add("A");
        rule.add("bb");

        cfg.put('B', rule);

        rule = new HashSet<>();
        rule.add("a");
        rule.add("b");

        cfg.put('F', rule);

        System.out.println("Input given = " + cfg);

        CNF converter = new CNF(cfg);
        converter.convert();
        converter.printDetails();
        System.out.println("Membership check for string aabbb = " + CYK.cykAlgorithm(cfg, "aabbb"));
        System.out.println("Membership check for string bbb = " + CYK.cykAlgorithm(cfg, "bbb"));
    }
}