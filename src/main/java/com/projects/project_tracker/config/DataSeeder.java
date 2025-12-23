package com.projects.project_tracker.config;

import com.projects.project_tracker.entity.Project;
import com.projects.project_tracker.repository.ProjectRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class DataSeeder implements CommandLineRunner {

    private final ProjectRepository projectRepository;

    public DataSeeder(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (projectRepository.count() == 0) {
            System.out.println("Seeding database with meaningful data...");

            List<Project> projects = List.of(
                    new Project(
                            "Website Redesign",
                            "Overhaul the corporate website with a modern responsive design and improved SEO.",
                            "In Progress",
                            "https://www.figma.com/design/website-redesign",
                            LocalDate.now().minusDays(15),
                            LocalDate.now().plusDays(45)),
                    new Project(
                            "Mobile App Launch",
                            "Launch the new iOS and Android applications for the retail platform.",
                            "Pending",
                            "https://github.com/project/mobile-app",
                            LocalDate.now().plusDays(10),
                            LocalDate.now().plusDays(100)),
                    new Project(
                            "Q3 Marketing Campaign",
                            "Execute the digital marketing strategy for the upcoming quarter focusing on social media.",
                            "Completed",
                            null,
                            LocalDate.now().minusDays(60),
                            LocalDate.now().minusDays(10)),
                    new Project(
                            "Internal Audit System",
                            "Develop an internal tool for finance team to audit expenses automatically.",
                            "On Hold",
                            "https://jira.company.com/browse/FIN-102",
                            LocalDate.now().minusDays(30),
                            LocalDate.now().plusDays(120)));

            projectRepository.saveAll(projects);
            System.out.println("Database seeded successfully.");
        }
    }
}
