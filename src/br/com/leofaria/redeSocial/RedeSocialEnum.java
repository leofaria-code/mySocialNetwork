package br.com.leofaria.redeSocial;

public enum RedeSocialEnum {
    INSTANCE;
    
    public RedeSocial novaRede() {
        System.out.println("Hello world!");
        return new RedeSocial();
    }
    
}
