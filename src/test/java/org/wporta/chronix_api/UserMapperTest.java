package org.wporta.chronix_api;

import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.wporta.chronix_api.user.User;
import org.wporta.chronix_api.user.UserDto;
import org.wporta.chronix_api.user.UserMapper;

import static org.junit.jupiter.api.Assertions.*;

@AllArgsConstructor
@SpringBootTest
public class UserMapperTest {

    private final UserMapper userMapper;

    @Test
    public void testToUserDto() {
        User user = new User();
        user.setUsername("testUser");
        user.setId(1L);
        // Add other fields...

        UserDto userDto = userMapper.toUserDto(user);
        assertNotNull(userDto);
        assertEquals("testUser", userDto.getUsername());
        assertEquals(1L, userDto.getId());
    }
}