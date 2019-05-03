package com.aca.carfabric.ui;

public abstract class UserInterface {

    /**
     * Send info to user.
     *
     * @param message the message
     * @return true if success.
     */
    public abstract boolean output(String[] message);

    /**
     * Get values from user.
     *
     * @return the size;
     */
    public abstract String readStr();
}
