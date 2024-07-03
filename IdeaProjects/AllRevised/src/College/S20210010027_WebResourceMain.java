package College;

class WebResource{
    private String domainName;
    private String path;
    private String resource;

    public WebResource(String domainName, String path, String resource) {
        this.domainName = domainName;
        this.path = path;
        this.resource = resource;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getFullURL(){
        return "http://" + getDomainName() +"/"+ getResource() +"/" +getPath();
    }
}

class SecureWebResources extends WebResource{
    public SecureWebResources(String domainName, String path, String resource) {
        super(domainName, path, resource);
    }

    @Override public String getFullURL(){
        return "https://"+ getDomainName() +"/"+ getResource() +"/"+ getPath();
    }
}

class DynamicWebResource extends WebResource{

    public DynamicWebResource(String domainName, String path, String resource, String servletName, String jspTemplate) {
        super(domainName, path, resource);
        this.servletName = servletName;
        this.jspTemplate = jspTemplate;
    }

    private String servletName;
    private String jspTemplate;

    public String getServletName() {
        return servletName;
    }

    public void setServletName(String servletName) {
        this.servletName = servletName;
    }

    public String getJspTemplate() {
        return jspTemplate;
    }

    public void setJspTemplate(String jspTemplate) {
        this.jspTemplate = jspTemplate;
    }

    @Override public String getFullURL(){
        return super.getFullURL().replace(getPath(), getServletName().replace(".", "/"));
    }
}

class SecureDynamicWebResource extends DynamicWebResource{
    public SecureDynamicWebResource(String domainName, String path, String resource, String servletName, String jspTemplate) {
        super(domainName, path, resource, servletName, jspTemplate);
    }

    @Override public String getFullURL(){
        return super.getFullURL().replace("http://", "https://");
    }
}
public class S20210010027_WebResourceMain {
    public static void printAllWebResourceURL(WebResource[] webResources){
        SecureWebResources temp2;
        DynamicWebResource temp3;
        SecureDynamicWebResource temp4;

        for(int i = 0; i < webResources.length; i++){
            if(webResources[i] instanceof SecureWebResources){
                temp2 = (SecureWebResources) webResources[i];
                System.out.println(temp2.getFullURL());
            } else if (webResources[i] instanceof DynamicWebResource){
                temp3 = (DynamicWebResource) webResources[i];
                System.out.println(temp3.getFullURL());
            } else if(webResources[i] instanceof SecureDynamicWebResource){
                temp4 = (SecureDynamicWebResource) webResources[i];
                System.out.println(temp4.getFullURL());
            } else System.out.println(webResources[i].getFullURL());
        }
    }

    public static void main(String[] args) {

        WebResource[] webResources = new WebResource[10];

        webResources[0] = new WebResource("www.github.com", "AnushthanS", "user");
        webResources[1] = new WebResource("www.hackerrank.com", "anushthan", "user");

        webResources[2] = new SecureWebResources("www.github.com", "AnushthanS", "user");
        webResources[3] = new SecureWebResources("www.hackerrank.com", "anushthan", "user");

        webResources[4] = new DynamicWebResource("www.github.com", "AnushthanS", "user", "org.iiits.IndexServlet", "local");
        webResources[5] = new DynamicWebResource("www.mysql.com", "root", "user", "org.iiits.IndexServlet", "local");

        webResources[6] = new SecureDynamicWebResource("www.leetcode.com", "anushthans", "profile", "com.personal.anushthans", "local");
        webResources[7] = new SecureDynamicWebResource("www.stackblitz.com", "anushthans", "@", "personal.AnushthanS", "local");


        webResources[8] = new SecureWebResources("www.frontendmasters.com", "info", "my-account");
        webResources[9] = new SecureWebResources("www.codecademy.com", "Anushthan", "profiles");
        printAllWebResourceURL(webResources);
    }
}
