# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Cython hash table that trusts the keys are pre-hashed"
HOMEPAGE = "https://github.com/explosion/preshed"
# NOTE: License in setup.py/PKGINFO is: MIT
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=32fe2e153ef3e7a7cb3148245bdb83c7"

SRC_URI[sha256sum] = "5a5c8e685e941f4ffec97f1fbf32694b8107858891a4bc34107fac981d8296ff"

inherit pypi setuptools3

DEPENDS += " python3-cython-native "

# WARNING: the following rdepends are from setuptools install_requires. These
# upstream names may not correspond exactly to bitbake package names.
RDEPENDS:${PN} += "python3-cymem python3-murmurhash"

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS:${PN} += "python3-core python3-math python3-pickle"

# WARNING: We were unable to map the following python package/module
# dependencies to the bitbake packages which include them:
#    preshed.bloom
#    preshed.counter
#    preshed.maps
#    pytest

PYPI_PACKAGE = "preshed"
