//encapsulation
public class student {
    private int id;
    public void setId(int id) //parameters
    {
        this.id=id;
    }
    public int getId()
    {
        return id;
    }
    public static void main(String args[])
    {
        student s=new student();
        s.setId(101);
        System.out.println(s.getId());
    }
}
