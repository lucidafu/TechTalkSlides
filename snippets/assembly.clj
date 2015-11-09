pushq  %rbp
movq   %rsp, %rbp
subq   $0x30, %rsp
leaq   -0x18(%rbp), %rax
movq   %rdi, -0x8(%rbp)
movq   %rsi, -0x10(%rbp)
movq   $0x0, -0x18(%rbp)
movq   %rax, %rdi
movq   %rdx, %rsi
movl   %ecx, -0x24(%rbp)
callq  0x100003b3a              
movl   -0x24(%rbp), %ecx
movl   %ecx, -0x1c(%rbp)
movl   $0x0, -0x20(%rbp)
movl   -0x20(%rbp), %eax
cmpl   -0x1c(%rbp), %eax
jge    0x100001869              
movq   -0x18(%rbp), %rax
movq   0x4522(%rip), %rs        
movq   %rax, %rdi
callq  0x100003b28              
movb   %al, -0x25(%rbp)
movl   -0x20(%rbp), %eax
addl   $0x1, %eax
movl   %eax, -0x20(%rbp)
jmp    0x100001837              
xorl   %eax, %eax
movl   %eax, %esi
leaq   -0x18(%rbp), %rcx
movq   %rcx, %rdi
callq  0x100003b3a              
addq   $0x30, %rsp
popq   %rbp
retq   
