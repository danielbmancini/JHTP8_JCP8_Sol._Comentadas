package ex7_35;

class dataBus {
    static int load(int targetSlot)
    {
        return memory.rmemory[targetSlot];
    }
    static void store(int targetSlot, int iR)
    {
        memory.rmemory[targetSlot] = iR;
    }
}
