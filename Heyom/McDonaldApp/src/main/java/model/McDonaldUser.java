package model;

import java.time.LocalDate;
import java.util.Objects;

public class McDonaldUser {
    private int id;
    private String username;
    private String fin;
    private String password;
    private LocalDate createdAt;
    private LocalDate uptadeAt;

    public McDonaldUser() {
    }

    public McDonaldUser(int id, String username, String fin, String password, LocalDate createdAt, LocalDate uptadeAt) {
        this.id = id;
        this.username = username;
        this.fin = fin;
        this.password = password;
        this.createdAt = createdAt;
        this.uptadeAt = uptadeAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUptadeAt() {
        return uptadeAt;
    }

    public void setUptadeAt(LocalDate uptadeAt) {
        this.uptadeAt = uptadeAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        McDonaldUser user = (McDonaldUser) o;
        return id == user.id && username.equals(user.username) && fin.equals(user.fin) && password.equals(user.password) && createdAt.equals(user.createdAt) && uptadeAt.equals(user.uptadeAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, fin, password, createdAt, uptadeAt);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", fin='" + fin + '\'' +
                ", password='" + password + '\'' +
                ", createdAt=" + createdAt +
                ", uptadeAt=" + uptadeAt +
                '}';
    }
}
