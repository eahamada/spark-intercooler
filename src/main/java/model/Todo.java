package model;

import java.util.UUID;

public class Todo {

    public String title;
    public String id;
    public Status status;

    public Todo(String title, String id, Status status) {
      this.title = title;
      this.id=id;
      this.status = status;
      
    }

    public void toggleStatus() {
        this.status = isComplete() ? Status.ACTIVE : Status.COMPLETE;
    }

    public boolean isComplete() {
        return this.status == Status.COMPLETE;
    }

    public static Todo create(String title) {
        return new Todo(title, UUID.randomUUID().toString(), Status.ACTIVE);
    }

}
