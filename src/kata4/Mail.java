package kata4;


public class Mail {
    private String mail;

    public Mail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }
    
    public String getDomain(){
        String[] result = this.mail.split("@");
        return result[1];
    }
}
