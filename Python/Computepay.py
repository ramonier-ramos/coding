def computepay(h,r):
	hrs = raw_input("Enter Hours:")
	h = float(hrs)
	rate = raw_input("Enter Rate:")
	r = float(rate)
	if h <= 40:
    	check = r * h
        return check
	if h > 40:
    	check = (r * 40) + ((1.5 * r) * (h - 40))
    	return check
    print check
hrs = raw_input("Enter Hours:")
h = float(hrs)
rate = raw_input("Enter Rate:")
r = float(rate) 
computepay(h,r)