package in.darshan.billingsoftware.service;

import in.darshan.billingsoftware.io.UserRequest;
import in.darshan.billingsoftware.io.UserResponse;

import java.util.List;

public interface UserService {

    UserResponse createUser(UserRequest request);

    String getUserRole(String email);

    List<UserResponse> readUsers();

    void deleteUser(String id);
}
