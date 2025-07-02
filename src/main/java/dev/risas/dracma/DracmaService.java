package dev.risas.dracma;

import java.util.UUID;

/**
 * @author Risas
 * @date 02-07-2025
 * @discord https://risas.me/discord
 */
public interface DracmaService {

    int getCurrency(UUID uuid, String currency);
    int getCurrency(String name, String currency);
    void setCurrency(UUID uuid, String currency, int amount);
    void setCurrency(String name, String currency, int amount);
    void addCurrency(UUID uuid, String currency, int amount);
    void addCurrency(String name, String currency, int amount);
    void removeCurrency(UUID uuid, String currency, int amount);
    void removeCurrency(String name, String currency, int amount);

    boolean isGlobalDiscount();
    int getGlobalDiscount();
    void setGlobalDiscount(int value);
}
