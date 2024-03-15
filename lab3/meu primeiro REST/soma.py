def soma(x):

    
    if x == 0:
        return 0
    else: 
        return x + soma(x-1)

x = 5
total = soma(x)
print(f"{total}")      

