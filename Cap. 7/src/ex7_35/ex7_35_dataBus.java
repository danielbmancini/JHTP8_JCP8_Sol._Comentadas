package ex7_35;

class ex7_35_dataBus {
    static int load(int targetSlot)
    {
        return ex7_35_memory.rmemory[targetSlot];
    }
    static void store(int targetSlot, int iR)
    {
            ex7_35_memory.rmemory[targetSlot] = iR;
    }
}
