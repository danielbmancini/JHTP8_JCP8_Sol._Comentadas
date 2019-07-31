package ex7_35;

class ex7_35_ALU {
    static void add(int targetSlot,int inRegister)
    {
        inRegister += ex7_35_memory.rmemory[targetSlot];
    }
    static void subtract(int tS,int iR)
    {
        iR -= ex7_35_memory.rmemory[tS];
    }
    static void multiply(int tS,int iR)
    {
        iR *= ex7_35_memory.rmemory[tS];
    }
    static void divide(int tS,int iR)
    {
        iR /= ex7_35_memory.rmemory[tS];
    }
}
