package tugas5.tiga;

public class Group extends Member {
    public String getNama(){
        System.out.println("Group Name  :"+ nama);
        return nama;
    }
    public static void main(String[] args) {
        Member req;
        Lecturer lecturerobject = new Lecturer();
        Group groupobject = new Group();

        req =lecturerobject;

        String temp = req.getNama();
        System.out.println(temp);

        req = groupobject;
        temp = req.getNama();
    }
}
