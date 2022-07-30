package HW1.task1;

public class Fire {
    private  final  FireDepartment fireDepartment;
    Fire()
    {
        fireDepartment=new FireDepartment();
    }
    public  void calltoFireDepartment()
    {
        fireDepartment.call(new Districs().generateRandomDistrict());
    }
}
