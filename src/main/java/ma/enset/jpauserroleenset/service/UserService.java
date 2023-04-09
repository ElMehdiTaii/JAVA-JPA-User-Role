package ma.enset.jpauserroleenset.service;

import ma.enset.jpauserroleenset.entities.Role;
import ma.enset.jpauserroleenset.entities.User;

public interface UserService {
    User addNewUser(User user);
    Role addNewRole(Role role);
    User findUserByUserName(String useName);
    Role findRoleByRoleName(String roleName);
    void addRoleToUser(String userName, String roleName);
    User authenticate(String userName, String password);


}
