package dao;

import owner.Client;

public interface Manipulate {
	void add(Client client);
	Client check(String password, String email);
}
