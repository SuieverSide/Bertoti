def fibonacci(x):
    
    if x <= 0:
        return x
    else: 
        return x + fibonacci(x-1) + fibonacci(x-2)

total = fibonacci(5)
print(f"{total}")      

