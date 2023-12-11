/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem451;
import java.util.ArrayList;
import java.util.List;

public class ReserveBlockList {
    private List<ReserveBlock> reserveBlocks;

    public ReserveBlockList() {
        reserveBlocks = new ArrayList<>();
    }

    public List<ReserveBlock> getReserveBlocks() {
        return reserveBlocks;
    }

    public void addReserveBlock(ReserveBlock reserveBlock) {
        reserveBlocks.add(reserveBlock);
    }

    public boolean removeReserveBlock(ReserveBlock reserveBlock) {
        return reserveBlocks.remove(reserveBlock);
    }

    // Other methods for managing ReserveBlock list operations
}
