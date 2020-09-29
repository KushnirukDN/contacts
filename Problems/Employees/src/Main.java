class Employee {

    protected String name;
    protected String email;
    protected int experience;

    protected Employee(String name, String email, int experience) {
        this.name = name;
        this.email = email;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public int getExperience() {
        return experience;
    }
}

class Developer extends Employee {
    protected String mainLanguage;
    protected String[] skills;

    protected Developer(String name, String email, int experience, String mainLanguage, String[] skills) {
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        if (skills == null) {
            this.skills = new String[0];
        } else {
            this.skills = java.util.Arrays.copyOf(skills, skills.length);
        }
    }
    public String getMainLanguage() {
        return mainLanguage;
    }
    public String[] getSkills() {
        return this.skills.clone();
    }
}

class DataAnalyst extends Employee {

    protected boolean phd;
    protected String[] methods;

    protected DataAnalyst(String name, String email, int experience, boolean phd, String[] methods) {
        super(name, email, experience);
        this.phd = phd;
        if (methods == null) {
            this.methods = new String[0];
        } else {
            this.methods = java.util.Arrays.copyOf(methods, methods.length);
        }
    }

    public boolean isPhd() {
        return phd;
    }
    public String[] getMethods() {
        return this.methods.clone();
    }
}