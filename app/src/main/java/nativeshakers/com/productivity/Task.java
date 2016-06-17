package nativeshakers.com.productivity;

import java.util.HashMap;

/**
 * Created by earlybirdcamp on 6/14/16.
 */
public class Task {
    String title;
    String time;
    String category;
    boolean completed;

    public enum Category {
        SCHOOLWORK, HOUSEWORK, PERSONAL, OTHER
    }

    public Task(String title, String category, String time) {
        this.title = title;
        this.category = category;
        this.time= time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getScore(){
        switch(this.category){
            case "SCHOOLWORK":
                return 10;
            case "HOUSEWORK":
                return 20;
            case "PERSONAL":
                return 30;
            case "OTHER":
                return 40;
            default:
                return 0;
        }
    }
}