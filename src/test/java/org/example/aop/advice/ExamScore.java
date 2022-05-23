package org.example.aop.advice;

public class ExamScore {
    String grade;
    int kor;
    int eng;
    int mat;

    public ExamScore() {}

    public ExamScore(String grade, int kor, int eng, int mat) {
        super();

        this.grade = grade;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    public void setKor(int kor) {
        this.kor = kor;
    }
    public void setEng(int eng) {
        this.eng = eng;
    }
    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getGrade() {
        return grade;
    }
    public int getKor() {
        return kor;
    }
    public int getEng() {
        return eng;
    }
    public int getMat() {
        return mat;
    }
}
