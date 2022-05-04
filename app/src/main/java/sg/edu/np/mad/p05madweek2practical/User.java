package sg.edu.np.mad.p05madweek2practical;

public class User {
    public String name;
    public String description;
    public int id;
    public boolean followed;

    public User(String n, String desc, int i, boolean f){
        name = n;
        description = desc;
        id = i;
        followed = f;
    }

}
