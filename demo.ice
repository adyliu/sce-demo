module sce{
    module demo{
        interface CounterService{
            int incr();
            int decr();
            int get();
            void set(int num);
        };
    };
};