package com.example.loginexample;

/**
 * 사용자 계정 정보 모델 클래스
 */
public class UserAccount
{
    private String idToken; //Firebase Uid (고유 토큰 정보)
    private String nameID; //이름
    private String Hackbun; //학번

    public UserAccount() { }

    public String getIdToken() {
        return idToken;
    }

    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    public String getNameID() {
        return nameID;
    }

    public void setNameID(String nameID) {
        this.nameID = nameID;
    }

    public String getHackbun() {
        return Hackbun;
    }

    public void setHackbun(String hackbun) {
        Hackbun = hackbun;
    }
}
