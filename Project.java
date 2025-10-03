package Aala;

public class Project {

	private String projectName;
    private String deadline;
    private Task[] tasks;
    private User[] teamMembers;
    private int taskCount;
    private int memberCount;
    private final int MAX_TASKS = 50;
    private final int MAX_MEMBERS = 20;

    public Project(String projectName, String deadline) {
        this.projectName = projectName;
        this.deadline = deadline;
        this.tasks = new Task[MAX_TASKS];
        this.teamMembers = new User[MAX_MEMBERS];
        this.taskCount = 0;
        this.memberCount = 0;
    }

    public String getProjectName() { return projectName; }
    public String getDeadline() { return deadline; }

    public void addTask(Task task) {
        if (taskCount < MAX_TASKS) {
            tasks[taskCount++] = task;
        } else {
            System.out.println("Task limit reached for project: " + projectName);
        }
    }

    public void addTeamMember(User user) {
        if (memberCount < MAX_MEMBERS) {
            teamMembers[memberCount++] = user;
        } else {
            System.out.println("Team member limit reached for project: " + projectName);
        }
    }

    public void listTasks() {
        System.out.println("Tasks in Project: " + projectName);
        for (int i = 0; i < taskCount; i++) {
            tasks[i].displayTask();
        }
    }

    public void showTeam() {
        System.out.println("Team Members in " + projectName + ":");
        for (int i = 0; i < memberCount; i++) {
            teamMembers[i].displayDetails();
        }
    }

    // Getters for tasks (needed by TaskManager)
    public Task[] getTasks() { return tasks; }
    public int getTaskCount() { return taskCount; }
}
