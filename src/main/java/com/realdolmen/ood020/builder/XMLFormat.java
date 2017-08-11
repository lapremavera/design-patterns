package com.realdolmen.ood020.builder;


public class XMLFormat extends EmailFormat {
private String XML = "";

    @Override
    public void createHeader() {
        XML+="<?xml version=”1.0” encoding=“UTF-8”?> <message>";


    }

    @Override
    public void createMessage() {
        XML+="</message>";
        //footer

    }

    @Override
    public void createFrom(String From) {
        XML+="<from>"+ From + "</from>";

    }

    @Override
    public void createTo(String To) {
        XML+="<to>"+ To + "</to>";

    }

    @Override
    public void createSubject(String Subject) {
        XML+="<subject>"+ Subject + "</subject>";

    }

    @Override
    public void createBody(String Body) {
        XML+="<body>"+ Body + "</body>";

    }
    public String getXML(){
        return XML;
    }
}
