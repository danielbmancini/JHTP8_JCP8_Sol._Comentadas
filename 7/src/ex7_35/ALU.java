package ex7_35;

class ALU {
    static void add(int targetSlot,int inRegister)
    {
        inRegister += memory.rmemory[targetSlot];
    }
    static void subtract(int tS,int iR)
    {
        iR -= memory.rmemory[tS];
    }
    static void multiply(int tS,int iR)
    {
        iR *= memory.rmemory[tS];
    }
    static void divide(int tS,int iR)
    {
        iR /= memory.rmemory[tS];
    }
}
