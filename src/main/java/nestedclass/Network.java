package nestedclass;

import java.util.ArrayList;

public class Network {
    private ArrayList<Member> members = new ArrayList<>();

    /**
     *  내부 클래스를 static으로 선언하지 않으면, outer 클래스의 field에 접근이 가능 하다. 마음껏 참조가 가능.
     *  static으로 선언하면 이게 안됨. outer의 field에 접근이 불가함.
     *  그래서 외부 field에 대한 접근이 필요 없을때, static으로 선언한다.
     *  그러면 static으로 선언하지 않고 field에 접근 안하면 되지 않음?
     *  굳이 static으로 선언해서 외부 클래스의 field에 접근 못하게 하면 이득이 뭐임?
     *  접근 제한자로서의 역할을 하는건가? static 키워드가?...
     *  그런거 같다.
     *  언어 설계자는 내부 클래스의 static이 메모리에 1개만 생성되는지, 인스턴스마다 하나만을 의미하는지를 불분명하게 명시했다고 한다.
     * @see Invoice.Item#addItem(Invoice.Item)
     * {@link Invoice.Item#addItem(Invoice.Item)}
     */
    public class Member {
        private String name;
        private ArrayList<Member> friends;

        public Member(String name) {
            this.name = name;
            friends = new ArrayList();
        }

        public void deactivate() {
            members.remove(this); // remove my-self.
//            unenroll(this); // 이것도 가능..
//            Network.this.members.remove(this); // 이것도 가능.. outer class를 명시해줄 수 있음. 외부 클래스 참조.
        }

        public boolean belongsTo(Network network) {
            return Network.this == network; // 여기서 그냥 this를 쓰면.. Member 인스턴스를 가리키게 된다.
        }
    }

    public Member enroll(String name) {
        Member newMember = new Member(name);
        members.add(newMember);
        return newMember;
    }

    public void unenroll(Member m) {
        members.remove(m);
    }

}
