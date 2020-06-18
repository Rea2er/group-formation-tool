package CSCI5308.GroupFormationTool.Resetpassword;


import CSCI5308.GroupFormationTool.AccessControl.User;

public interface IResetPasswordService {
	public void saveUserResetToken(User user);
	public User findUserByResetToken(String resetToken);
	public void saveUserPassword(User user);
}