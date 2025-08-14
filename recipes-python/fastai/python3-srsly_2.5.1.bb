# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Modern high-performance serialization utilities for Python"
HOMEPAGE = "https://github.com/explosion/srsly"
# NOTE: License in setup.py/PKGINFO is: MIT
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=754538234c847bb2d44f73bf32aa221b"

SRC_URI[sha256sum] = "ab1b4bf6cf3e29da23dae0493dd1517fb787075206512351421b89b4fc27c77e"

inherit pypi setuptools3

DEPENDS += " python3-cython-native "

# WARNING: the following rdepends are from setuptools install_requires. These
# upstream names may not correspond exactly to bitbake package names.
RDEPENDS:${PN} += "python3-catalogue"

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS:${PN} += "python3-asyncio python3-compression python3-core python3-datetime python3-difflib python3-io python3-json python3-logging python3-math python3-multiprocessing python3-netclient python3-numbers python3-numpy python3-pickle python3-pprint python3-psutil python3-shell python3-tornado python3-typing-extensions python3-unittest python3-xml"

# WARNING: We were unable to map the following python package/module
# dependencies to the bitbake packages which include them:
#    StringIO
#    __pypy__
#    __pypy__.builders
#    _cloudpickle_testpkg
#    _cloudpickle_testpkg.mod
#    _cloudpickle_testpkg.mod.dynamic_submodule
#    _cloudpickle_testpkg.mod.dynamic_submodule.dynamic_subsubmodule
#    _cloudpickle_testpkg.mod.submodule_three
#    _ruamel_yaml
#    cStringIO
#    configobj
#    copy_reg
#    cupy
#    mock
#    mock_local_folder
#    mock_local_folder.mod
#    mock_local_folder.subfolder
#    mock_local_folder.subfolder.submod
#    pickle5
#    py
#    pytest
#    scipy.special
#    srsly.msgpack._epoch
#    srsly.msgpack._packer
#    srsly.msgpack._unpacker
#    srsly.ujson.ujson

PYPI_PACKAGE = "srsly"
