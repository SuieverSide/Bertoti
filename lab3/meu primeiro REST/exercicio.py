def retorno(n):
    
    if n == 1:
        print (1)
        return
    print(n)
    retorno (n - 1)
    print(n)

retorno(5)

