import hashlib

correct_pw_hash = open('level5.hash.bin', 'rb').read()

pos_pw_list = open('dictionary.txt').read().split('\n')

# print(pos_pw_list)

def hash_pw(pw_str):
    pw_bytes = bytearray()
    pw_bytes.extend(pw_str.encode())
    m = hashlib.md5()
    m.update(pw_bytes)
    return m.digest()


def check_all():
    for pw in pos_pw_list:
        hashedpw = hash_pw(pw)
        if hashedpw == correct_pw_hash:
            print("la password è: " + pw)


check_all()