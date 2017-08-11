package com.realdolmen.ood020.builder;

//This is the director
public class EmailConverter {
    private EmailFormat emailFormat;

    public EmailConverter(EmailFormat emailFormat) {
        this.emailFormat = emailFormat;
    }
    public void convertMail(Email email){
        //give instructions to builder for each part
        emailFormat.createHeader();
        emailFormat.createFrom(email.getFrom());
        emailFormat.createTo(email.getTo());
        emailFormat.createSubject(email.getSubject());
        emailFormat.createBody(email.getBody());
        emailFormat.createMessage();
    }

}
