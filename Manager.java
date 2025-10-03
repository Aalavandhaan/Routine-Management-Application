package Aala;

public class Manager extends User {

	private int teamSize;

    public Manager(int id, String name, String email, int teamSize) {
        super(id, name, "Manager", email);
        this.teamSize = teamSize;
    }

    public int getTeamSize() { return teamSize; }
    public void setTeamSize(int teamSize) { this.teamSize = teamSize; }

    @Override
    public void displayDetails() {
        System.out.println("Manager: " + getName() + " (Team Size: " + teamSize + ")");
    }

    public void approveTask(Task task) {
        System.out.println("Manager " + getName() + " approved task: " + task.getTitle());
    }

}
