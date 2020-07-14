package CSCI5308.GroupFormationTool.Courses;

import java.util.List;

import CSCI5308.GroupFormationTool.AccessControl.IUser;

public interface ICourseUserRelationship {
	public boolean userHasRoleInCourse(IUser user, Role role, Course course);

	public List<Role> loadAllRoluesForUserInCourse(IUser user, Course course);

	public boolean enrollUserInCourse(IUser user, Course course, Role role);
}
