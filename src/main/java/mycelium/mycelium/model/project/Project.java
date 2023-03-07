package mycelium.mycelium.model.project;

import java.util.Date;
import java.util.Optional;

/**
 * Represents a project.
 */
public class Project {
    /**
     * The project's name
     */
    private final String name;

    /**
     * The project's status
     */
    private final ProjectStatus status;

    /**
     * The client who submitted this project
     */
    private final String client; // TODO update to actual Client class

    /**
     * The project's source, e.g. Fiverr
     */
    private final String source;

    /**
     * Arbitrary description for the project
     */
    private final String description;

    /**
     * The date on which this project was accepted
     */
    private final Date acceptedOn;

    /**
     * A potential deadline for this project
     */
    private final Optional<Date> deadline;

    /**
     * Every field must be present and not null.
     */
    public Project(String name,
                   ProjectStatus status,
                   String client,
                   String source,
                   String description,
                   Date acceptedOn,
                   Optional<Date> deadline) {
        this.name = name;
        this.status = status;
        this.client = client;
        this.source = source;
        this.description = description;
        this.acceptedOn = acceptedOn;
        this.deadline = deadline;
    }

    public String getName() {
        return name;
    }

    public ProjectStatus getStatus() {
        return status;
    }

    public String getClient() {
        return client;
    }

    public String getSource() {
        return source;
    }

    public String getDescription() {
        return description;
    }

    public Date getAcceptedOn() {
        return acceptedOn;
    }

    public Optional<Date> getDeadline() {
        return deadline;
    }

    /**
     * Checks if two projects refer to the same project
     *
     * @param other The other project
     * @return True if the two projects refer to the same physical project
     */
    public boolean isSameProject(Project other) {
        if (this == other) {
            return true;
        }
        return other != null && this.name.equals(other.name);
    }
}

