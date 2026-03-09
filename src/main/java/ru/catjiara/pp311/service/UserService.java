package ru.catjiara.pp311.service;

import ru.catjiara.pp311.models.User;

import java.util.List;

public interface UserService {
    public List<User> index();
    public User getUser(int id);
    public void save(User user);
    public void update(int id, User user);
    public void delete(int id);

}
