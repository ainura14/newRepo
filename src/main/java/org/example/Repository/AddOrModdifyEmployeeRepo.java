package org.example.Repository;

public interface AddOrModdifyEmployeeRepo {
    void AddOrModdifyEmployee(String fullName, String position, int startYear, double salary);
    void openFile();
    void openFile(String fileName);
}
