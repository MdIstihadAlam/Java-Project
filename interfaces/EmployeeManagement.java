package interfaces;
import java.lang.*;
import classes.*;

public interface EmployeeManagement
{
	void insertEmployee(Employee e);
	void removeEmployee(Employee e);
	Employee getEmployee(String empId);
	void showAllEmployees();
}