package repository;

import com.onlineschool.models.Lecture;

import java.util.Arrays;

public class LectureRepository {
   private int BOXES = 8;
    private Lecture[] lecturesArray = new Lecture[BOXES];
    public void addLecture(Lecture lecture) {

        for (int i = 0; i < lecturesArray.length; i++) {

            if (lecturesArray[i] == null) {
                lecturesArray[i] = lecture;

                break;
            }

        }
    }

    public Lecture[] getLecturesArray() {
        return lecturesArray;
    }

    public void setLecturesArray(Lecture[] lecturesArray) {
        this.lecturesArray = lecturesArray;
    }

    @Override
    public String toString() {
        return "LectureRepository{" +
                "lecturesArray=" + Arrays.toString(lecturesArray) +
                '}';
    }
}
