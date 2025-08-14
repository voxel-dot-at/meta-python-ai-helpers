# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Cython bindings for MurmurHash"
HOMEPAGE = "https://github.com/explosion/murmurhash"
# NOTE: License in setup.py/PKGINFO is: MIT
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=924de4126851ad444ad084cd7aff453b"

SRC_URI[sha256sum] = "737246d41ee00ff74b07b0bd1f0888be304d203ce668e642c86aa64ede30f8b7"

inherit pypi setuptools3

DEPENDS += " python3-cython-native "

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS:${PN} += "python3-core"

# WARNING: We were unable to map the following python package/module
# dependencies to the bitbake packages which include them:
#    murmurhash.mrmr

PYPI_PACKAGE = "murmurhash"
