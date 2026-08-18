public  class PasswordChecker {
    public static void Password (){
        String a="Abc@2005";
    boolean upper=false;
    boolean lower=false;
    boolean digits=false;
    boolean special=false;
    for(int i=0;i<a.length();i++){
    char ch=a.charAt(i);
    if(ch>='A' && ch<='Z') upper=true;
    else if(ch>='a' && ch<='z') lower=true;
    else if(ch>='0' && ch<='9') digits=true;
    else special=true;

    }
    if(a.length()>=8 && upper && lower && digits && special){
        System.out.println("Valid Password");
    }
    else{
         System.out.println("InValid Password");
    }
    }
    public static void main(String[] args) {
        Password ();
    }

}