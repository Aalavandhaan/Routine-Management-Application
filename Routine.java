package Aala;

public class Routine {

	private int id;
    private String title;
    private String description;
    private String status; // TODO, IN PROGRESS, DONE
    private User assignedUser;

    public Routine(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = "TODO";
    }

    // Getters & Setters
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getStatus() { return status; }
    public User getAssignedUser() { return assignedUser; }

    public void setStatus(String status) { this.status = status; }
    public void assignUser(User user) { this.assignedUser = user; }

    public void displayTask() {
        System.out.println("Task: " + id + ", " + title + " [" + status + "] "
                + (assignedUser != null ? " -> " + assignedUser.getName() : " (Unassigned)"));
    }

}
