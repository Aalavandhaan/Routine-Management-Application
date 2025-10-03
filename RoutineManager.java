package Aala;

public class RoutineManager {

	private User[] users = new User[50];
    private Project[] projects = new Project[20];
    private int userCount = 0;
    private int projectCount = 0;

    public void addUser(User user) {
        if (userCount < users.length) {
            users[userCount++] = user;
        }
    }

    public void addProject(Project project) {
        if (projectCount < projects.length) {
            projects[projectCount++] = project;
        }
    }

    // Method Overloading → Assign task with/without deadline
    public void assignTask(Task task, User user) {
        task.assignUser(user);
        System.out.println("Task '" + task.getTitle() + "' assigned to " + user.getName());
    }

    public void assignTask(Task task, User user, String deadline) {
        task.assignUser(user);
        System.out.println("Task '" + task.getTitle() + "' assigned to " + user.getName()
                + " with deadline " + deadline);
    }

    public void updateTaskStatus(Task task, String status) {
        task.setStatus(status);
        System.out.println("Task '" + task.getTitle() + "' updated to " + status);
    }

    public void showUserReport(User user) {
        System.out.println("Report for " + user.getName() + ":");
        for (int i = 0; i < projectCount; i++) {
            Project p = projects[i];
            for (int j = 0; j < p.getTaskCount(); j++) {
                Task t = p.getTasks()[j];
                if (t.getAssignedUser() != null && t.getAssignedUser().getId() == user.getId()) {
                    System.out.println(" - " + t.getTitle() + " [" + t.getStatus() + "]");
                }
            }
        }
    }

    public void listAllProjects() {
        for (int i = 0; i < projectCount; i++) {
            Project p = projects[i];
            System.out.println("Project: " + p.getProjectName() + " (Deadline: " + p.getDeadline() + ")");
            p.listTasks();
        }
    }

}
