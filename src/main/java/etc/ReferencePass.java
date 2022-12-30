package etc;

public class ReferencePass {
    public static void main(String[] args) {
        ReferencePass reference = new ReferencePass();
        reference.callByReference();
    }

    public void callByReference() {
        MemberDTO member = new MemberDTO("wook");
        System.out.println("Before CallByReference: "+member.name);
        passByReference2(member);
        System.out.println("after CallByReference: "+member.name);
    }

    public void passByReference(MemberDTO member) {
        member = new MemberDTO();
        member.name = "yoon";
        System.out.println("In CallByReference: "+member.name);
    }
    public void passByReference2(MemberDTO member) {
        member.name = "yoon";
        System.out.println("In CallByReference: "+member.name);
    }
}

class MemberDTO{
    public String name;

    public MemberDTO(){

    };

    public MemberDTO(String name) {
        this.name = name;
    }
}