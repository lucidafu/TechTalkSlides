0x100001800 <+0>:   pushq  %rbp
0x100001801 <+1>:   movq   %rsp, %rbp
0x100001804 <+4>:   subq   $0x30, %rsp
0x100001808 <+8>:   leaq   -0x18(%rbp), %rax
0x10000180c <+12>:  movq   %rdi, -0x8(%rbp)
0x100001810 <+16>:  movq   %rsi, -0x10(%rbp)
0x100001814 <+20>:  movq   $0x0, -0x18(%rbp)
0x10000181c <+28>:  movq   %rax, %rdi
0x10000181f <+31>:  movq   %rdx, %rsi
0x100001822 <+34>:  movl   %ecx, -0x24(%rbp)
0x100001825 <+37>:  callq  0x100003b3a      
0x10000182a <+42>:  movl   -0x24(%rbp), %ecx
0x10000182d <+45>:  movl   %ecx, -0x1c(%rbp)
0x100001830 <+48>:  movl   $0x0, -0x20(%rbp)
0x100001837 <+55>:  movl   -0x20(%rbp), %eax
0x10000183a <+58>:  cmpl   -0x1c(%rbp), %eax
0x10000183d <+61>:  jge    0x100001869      
0x100001843 <+67>:  movq   -0x18(%rbp), %rax
0x100001847 <+71>:  movq   0x4522(%rip), %rs
0x10000184e <+78>:  movq   %rax, %rdi
0x100001851 <+81>:  callq  0x100003b28      
0x100001856 <+86>:  movb   %al, -0x25(%rbp)
0x100001859 <+89>:  movl   -0x20(%rbp), %eax
0x10000185c <+92>:  addl   $0x1, %eax
0x100001861 <+97>:  movl   %eax, -0x20(%rbp)
0x100001864 <+100>: jmp    0x100001837      
0x100001869 <+105>: xorl   %eax, %eax
0x10000186b <+107>: movl   %eax, %esi
0x10000186d <+109>: leaq   -0x18(%rbp), %rcx
0x100001871 <+113>: movq   %rcx, %rdi
0x100001874 <+116>: callq  0x100003b3a      
0x100001879 <+121>: addq   $0x30, %rsp
0x10000187d <+125>: popq   %rbp
0x10000187e <+126>: retq   
