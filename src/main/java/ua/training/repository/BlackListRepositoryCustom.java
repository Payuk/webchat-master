package ua.training.repository;

import ua.training.dto.UserDTO;

/**
 * Created by Payuk on 28.03.2017.
 */
public interface BlackListRepositoryCustom {
    void addUserToBlackList(UserDTO userDTO);
    void removeUserFromBlackList(Long id);
}
