package Aala;

public class RoutineMain {

	public static void main(String[] args) {
		TaskManager manager = new TaskManager();

        // Create Users
        User u1 = new User(1, "Alice", "Developer", "alice@company.com");
        User u2 = new User(2, "Bob", "Tester", "bob@company.com");
        Manager m1 = new Manager(3, "Charlie", "charlie@company.com", 5);

        manager.addUser(u1);
        manager.addUser(u2);
        manager.addUser(m1);

        // Create Project
        Project p1 = new Project("Website Revamp", "2025-12-31");
        p1.addTeamMember(u1);
        p1.addTeamMember(u2);
        p1.addTeamMember(m1);

        // Create Tasks
        Task t1 = new Task(101, "Design Homepage", "Create modern homepage layout");
        Task t2 = new Task(102, "Test Login", "Ensure login works properly");

        p1.addTask(t1);
        p1.addTask(t2);

        manager.addProject(p1);

        // Assign Tasks
        manager.assignTask(t1, u1);
        manager.assignTask(t2, u2, "2025-10-15");

        // Update Task Status
        manager.updateTaskStatus(t1, "IN PROGRESS");
        manager.updateTaskStatus(t1, "DONE");

        // Display Project Details
        p1.listTasks();
        p1.showTeam();

        // Reports
        manager.showUserReport(u1);
        manager.showUserReport(u2);

        // Polymorphism Demo
        User ref = m1;
        ref.displayDetails(); 

	}

}
