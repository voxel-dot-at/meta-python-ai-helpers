# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Manage calls to calloc/free through Cython"
HOMEPAGE = "https://github.com/explosion/cymem"
# NOTE: License in setup.py/PKGINFO is: MIT
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=da88223991610e1c46faf71219779cfb"

SRC_URI[sha256sum] = "efe49a349d4a518be6b6c6b255d4a80f740a341544bde1a807707c058b88d0bd"

inherit pypi setuptools3

DEPENDS += " python3-cython-native "

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS:${PN} += "python3-core"

# WARNING: We were unable to map the following python package/module
# dependencies to the bitbake packages which include them:
#    cymem.cymem

PYPI_PACKAGE = "cymem"
